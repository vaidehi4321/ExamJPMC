import com.sun.xml.internal.bind.api.impl.NameConverter;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Arrays;

public class KthStatistics {
    public String findKthStatistics(String input) {
                String[] lines = input.split("\n");
                String line1 = lines[0];
                String line2 = lines[1];
                int k = Integer.parseInt(line1);
                String[] sourceArr = line2.split(" ");
                Integer[] targetArr = new Integer[sourceArr.length];
                for (int i = 0; i < sourceArr.length; i++) {
                    targetArr[i] = Integer.parseInt(sourceArr[i]);
                }
                Arrays.sort(targetArr);
                int kthSmallest = targetArr[k - 1];

                System.out.println("kth Smallest element is " + kthSmallest);
                return Integer.toString(kthSmallest);

            }


        }



