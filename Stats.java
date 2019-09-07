package com.practice.programs.random;

import java.util.*;
import java.util.concurrent.*;

public class Stats {
	static Map<String, ArrayList<Double>> map = new HashMap<>();

	public static class StatisticsAggregatorImpl implements StatisticsAggregator {

		@Override
		public void putNewPrice(String symbol, double price) {
			ArrayList<Double> tempList = null;
			if (map.containsKey(symbol)) {
				tempList = map.get(symbol);
				if (tempList == null)
					tempList = new ArrayList<>();
				tempList.add(price);
			} else {
				tempList = new ArrayList<>();
				tempList.add(price);
			}
			map.put(symbol, tempList);
		}

		@Override
		public double getAveragePrice(String symbol) {
			ArrayList<Double> tempList = null;
			int size = 0;
			double sum = 0;
			double average = 0;
			tempList = map.get(symbol);
			size = tempList.size();
			for (Double value : tempList) {
				sum += value;
			}
			average = sum / size;
			return average;
		}

		@Override
		public int getTickCount(String symbol) {
			ArrayList<Double> tempList = null;
			tempList = map.get(symbol);
			return tempList.size();
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = scanner.nextLine();
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		scanner.close();

	}
}