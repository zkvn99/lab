package org.example.queue;

import com.sun.jdi.connect.spi.TransportService.ListenKey;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {

  static class Truck {

    int weight;
    int exitTime;

    public Truck(int weight, int exitTime) {
      this.weight = weight;
      this.exitTime = exitTime;
    }
  }

  public int solution(int w, int l, Integer[] truckWeight) {
    Queue<Truck> bridge = new LinkedList<>();
    int time = 0;
    int sumWeight = 0;
    int idx = 0;

    while (true) {
      time++;

      if (!bridge.isEmpty() && bridge.peek().exitTime == time) {
        sumWeight -= bridge.poll().weight;
      }

      if (idx < truckWeight.length) {
        int next = truckWeight[idx];
        if (sumWeight + next <= l && bridge.size() < w) {
          bridge.offer(new Truck(next, time + w));
          sumWeight += next;
          idx++;
        }
      }

      if (idx == truckWeight.length && bridge.isEmpty()) {
        return time;
      }
    }
  }
}