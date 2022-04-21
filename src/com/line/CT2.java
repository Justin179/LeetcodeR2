package com.line;

public class CT2 {
    public static void main(String[] args) {
        
    }
}

/*
You need to transfer some information through a slow datalink as fast as possible.
You consider using a file archiver to compress data before sending.

The first line of input contains an integer dataSize - the size of data you need to transfer in bytes. 1 <= dataSize <= 10000.
The second line of input contains an integer transferSpeed - the speed of data transfer through the link, in bytes per second. 1 <= transferSpeed <= 10.
The third line of input contains an integer N - the number of archivers you are considering. 1 <= N <= 2.
The following N lines contain information about archivers,
each line describing one archiver with two space-separated integers: processingSpeed -
the speed of data processing (both compression and extraction) in bytes per second,
and compressionRate - the rate of compression achieved by the archiver
(i.e. the size of compressed data divided by the size of original data), in percent. 1 <= processingSpeed <= 100, 1 <= compressionRate <= 99.

Output the minimal time you'll need to send the data through the datalink, including compression and extraction time,
rounded up to the nearest integer. Round up only the final answer, not intermediary calculations results.

Example

input

1000
10
2
100 50
60 20

output

40

Sending the data uncompressed will take 1000/10 = 100 seconds.
Using first archiver will take 1000/100 + 1000*0.5/10 + 1000*0.5/100 = 65 seconds.
Using second archiver will take 1000/60 + 1000*0.2/10 + 1000*0.2/60 = 39 1/3 seconds, rounding up to 40 seconds.
 */
