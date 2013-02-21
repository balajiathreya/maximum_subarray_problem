import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: balaji
 * Date: 2/15/13
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class HW2 {
    public static int[] sample1 = new int[]{-371,-287,978,738,-766,836,899,521,-505,31,-387,-60,396,110,4,855,927,580,495,-269,146,890,914,860,-269,125,-921,-806,-339,647,137,592,322,622,-497,294,166,-109,-899,764,-160,969,15,923,361,729,-635,-827,916,-39,464,635,-453,-772,196,845,181,-929,215,262,520,708,550,14,82,-284,14,-93,304,-586,-524,937,104,-834,81,-9,146,-452,-838,791,120,-695,-468,930,-132,607,247,-551,-65,205,-630,-215,68,-737,46,327,-478,-582,-363,895};
    public static int[] sample2 = new int[]{-180,885,-827,826,-274,895,638,751,-776,-666,-595,-123,590,-148,827,-599,-527,-711,557,660,54,-695,681,-80,-130,235,-445,-235,-627,795,-378,447,176,30,382,451,-33,-139,766,-731,319,488,646,-972,-750,-843,346,16,-227,774,976,-780,-447,-130,-34,-127,-112,-673,462,-381,-823,190,428,-398,-43,-619,757,-972,-376,232,-50,-748,-527,-674,913,588,822,-854,-946,689,740,-547,-861,-151,-185,789,359,-698,548,-480,864,-948,-137,-109,457,925,-744,-248,-399,230};
    public static int[] sample3 = new int[]{31,-391,801,823,-335,-336,-747,-947,206,161,694,559,170,588,-189,343,-255,-371,354,534,-490,990,765,-105,742,-696,-498,-352,-770,139,-794,143,-485,-623,-238,230,-37,495,-838,738,-161,-574,-142,19,240,-135,285,553,-480,-975,-196,631,453,689,662,-526,-854,-689,488,-625,366,152,-62,550,-567,149,-848,-364,-860,784,-890,-257,-526,-948,262,-587,276,-710,315,-757,-558,-371,-327,-692,880,624,-360,435,-275,165,320,551,783,-17,-884,776,519,599,-73,628};
    public static int[] sample4 = new int[]{-435,-550,-524,761,218,-495,462,-526,939,-573,396,-782,-90,-164,279,-59,319,533,-630,295,620,254,854,-857,-819,906,-571,-821,172,-920,-894,-230,361,557,119,953,-417,-510,673,962,871,235,-685,-610,376,610,633,7,-584,157,770,641,500,260,-858,-543,-103,-23,239,532,819,-296,-286,-986,587,-476,929,-454,300,433,681,-453,-389,-355,200,884,945,-349,-659,-696,619,-783,769,979,-213,317,-636,-804,431,-46,388,-111,-696,398,-158,857,610,-515,645,129};
    public static int[] sample5 = new int[]{-50,-783,619,-568,-979,-103,-522,-180,492,-689,-306,390,-623,-562,-199,685,-389,-401,-390,-939,510,-836,907,6,918,-580,352,-459,-271,915,941,755,791,810,-606,-499,-637,486,394,-260,425,-329,350,706,521,19,-470,-883,269,-868,-620,-464,-296,641,-71,-457,816,-238,-504,222,-692,730,-730,-498,277,-217,-735,-196,698,731,200,-742,-553,-591,-905,313,275,104,-27,505,-712,-301,-984,397,598,975,827,121,-686,737,609,-767,16,55,-841,426,-472,558,-101,76};
    public static int[] sample6 = new int[]{-943,209,230,-972,-823,481,-777,-177,-776,199,321,-879,-669,302,-641,-950,863,275,-372,1000,417,-108,-875,-239,48,753,107,796,-850,799,-812,493,-238,127,570,-438,-535,-431,207,-611,906,265,-447,706,-546,-190,599,336,-291,-415,334,-807,908,-854,-583,620,2,542,-711,440,879,-865,-776,331,529,-358,194,-540,-798,677,-441,-228,-678,55,-549,-514,602,-645,175,-647,150,-253,-706,369,-995,347,-768,52,-3,352,-241,995,451,-549,27,-834,600,-443,916,-982};
    public static int[] sample7 = new int[]{-723,111,-442,-816,110,-806,-539,-525,-649,-417,-231,164,755,862,733,-97,-624,454,997,554,642,-388,816,-302,-345,-535,-595,354,-339,-696,312,-865,-372,200,241,100,-23,-878,27,-32,831,32,-251,149,-552,-69,-377,-181,-730,-26,-21,114,904,960,398,-112,-668,-718,-29,188,883,-598,-35,-608,480,-460,-243,367,-315,-961,931,-374,781,-933,-284,-441,759,112,-372,193,-233,-424,-423,-207,42,-596,950,-562,-607,215,-501,358,455,-48,132,-491,-141,36,-103,-423};
    public static int[] sample8 = new int[]{-763,210,302,439,937,564,635,752,-353,-30,89,-252,-144,-600,779,-162,425,421,572,-345,-334,-103,738,-987,-18,-83,973,-4,188,333,-258,-918,-685,240,-541,912,329,226,-505,-124,-635,574,-207,-366,-970,-263,431,-998,-567,-648,-60,663,200,440,464,821,-615,341,-231,446,-127,817,852,988,-746,-991,-204,-271,-577,-338,-825,710,553,-685,472,-811,914,330,-284,-81,301,875,-735,982,423,-711,-587,334,-634,761,-343,-116,614,-913,-413,-304,777,-472,-862,310};
    public static int[] sample9 = new int[]{22,586,774,-383,529,-459,-606,-822,-827,-599,-720,-282,-176,588,18,-907,-793,330,401,-915,-23,-456,-978,540,419,810,-944,-79,4,-885,117,704,342,301,-822,-497,-916,-243,409,-681,337,5,-736,-227,171,124,827,349,212,-8,-230,354,433,933,-839,-110,57,150,-905,818,-508,-615,-548,513,368,-374,577,-615,-818,-888,-907,587,759,208,56,361,-379,88,946,561,94,967,-918,820,-556,-598,833,-96,355,612,957,-695,384,627,738,794,557,238,-618,744};
    public static int[] sample10 = new int[]{878,-959,-238,-574,-303,-743,757,332,531,-802,326,435,1,-218,-544,852,-376,-311,669,-76,962,-523,-518,942,-618,173,301,102,563,737,699,174,63,-736,964,76,901,638,93,847,-807,-671,933,530,466,105,407,-77,-112,244,-705,-490,794,-304,-203,-172,829,638,-934,-746,-858,-738,-821,-343,495,322,77,-759,-495,345,235,248,601,158,419,863,209,756,-769,536,-234,830,805,-708,-423,-802,338,-19,795,198,-510,-378,84,-601,473,438,-471,-168,114,426};
    public static int nooftries = 11;



    public static void main(String[] args){
        try{
            testSamples();
            testRandom();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }


    public static void testSamples(){
        if(bruteforce(sample1) != 12792) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample2) != 3360) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample3) != 4696) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample4) != 7682) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample5) != 5655) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample6) != 2754) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample7) != 4868) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample8) != 5059) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample9) != 8426) System.out.println("failed"); else System.out.println("passed");
        if(bruteforce(sample10) != 9023) System.out.println("failed"); else System.out.println("passed");

        if(divide_and_conquer(sample1) != 12792) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample2) != 3360) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample3) != 4696) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample4) != 7682) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample5) != 5655) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample6) != 2754) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample7) != 4868) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample8) != 5059) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample9) != 8426) System.out.println("failed"); else System.out.println("passed");
        if(divide_and_conquer(sample10) != 9023) System.out.println("failed"); else System.out.println("passed");

        if(dynamic(sample1) != 12792) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample2) != 3360) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample3) != 4696) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample4) != 7682) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample5) != 5655) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample6) != 2754) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample7) != 4868) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample8) != 5059) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample9) != 8426) System.out.println("failed"); else System.out.println("passed");
        if(dynamic(sample10) != 9023) System.out.println("failed"); else System.out.println("passed");
    }

    public static void testRandom() throws Exception{
        int[] array;
        int[] sizes = new int[]{1000,2000,3000,4000,5000,10000,20000,30000,40000,50000};
//        int[] sizes = new int[]{1000,2000};
        long[] a1 = new long[sizes.length];
        long[] a2 = new long[sizes.length];
        long[] a3 = new long[sizes.length];

        for(int i = 0; i < sizes.length; i++){
            long algo1 = 0;
            long algo2 = 0;
            long algo3 = 0;
            array = randomArray(sizes[i]);
            for(int j = 0; j< nooftries;j++){
                long startTime = 0;
                long stopTime = 0;

                startTime = System.currentTimeMillis();
               // long res1 = bruteforce(array);
                long res1 = 0;
                stopTime = System.currentTimeMillis();
                int diff = (int)(stopTime - startTime);
                algo1 = algo1 + diff;

                startTime = System.currentTimeMillis();
                long res2 = divide_and_conquer(array);
                stopTime = System.currentTimeMillis();
                diff = (int)(stopTime - startTime);
                algo2 = algo2 + diff;

                startTime = System.currentTimeMillis();
                long res3 = dynamic(array);
                stopTime = System.currentTimeMillis();
                diff = (int)(stopTime - startTime);
                algo3 = algo3 + diff;
//                if(!(res1 == res2 && res2 == res3))
//                    throw new Exception();
                if(!(res2 == res3))
                    throw new Exception();
                else
                    System.out.println(res2);
            }
            algo1 /= nooftries;
            algo2 /= nooftries;
            algo3 /= nooftries;
            a1[i] = algo1;
            a2[i] = algo2;
            a3[i] = algo3;
//            System.out.println("Size: "+sizes[i]+"\t"+a1[i]+"\t"+a2[i]+"\t"+a3[i]);
            System.out.println(sizes[i]+"\t"+a1[i]+"\t"+a2[i]+"\t"+a3[i]);
        }
    }

    public static int[] randomArray(int size){
        int[] array = new int[size];
        int i = 0;
        Random r = new Random();
        while (i < size){
            int a = (int)(r.nextInt(65536)-32768);
            array[i] = a;
            i++;
        }
        return array;
    }


    public static long bruteforce(int[] input){
        int max_i = 0;
        int max_j = 0;
        long max = 0;
        int[][] results = new int[input.length][input.length];
        int i,j;
        try{
            for(i = 0; i < input.length; i++){
                results[i][i] = input[i];
                for(j=i+1; j < input.length; j++){
                    results[i][j] = results[i][j - 1] + input[j];
                    if(max < results[i][j]){
                        max_i = i;
                        max_j = j;
                        max = results[i][j];
                    }

                }
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        return max;
    }

    public static long divide_and_conquer(int[] input){
        return divide_and_merge(input,0,input.length - 1)[0];
    }

    public static long[] divide_and_merge(int[] a,int start, int end){
        if(start == end){
            long[] b = new long[3];
            b[0] = a[start];
            b[1] = start;
            b[2] = start;
            return b;
        }
        int mid = (start + end) /2;
        long[] left = divide_and_merge(a,start,mid);
        long[] right = divide_and_merge(a,mid+1,end);
        long[] cross = cross_and_merge(a,start,mid,end);
        if(left[0] >= right[0] && left[0] >= cross[0]){
            return left;
        }
        else if (right[0] >= left[0] && right[0] >= cross[0]){
            return right;
        }
        return cross;
    }

    public static long[] cross_and_merge(int[] a, int start, int mid, int end){
        Long lsum = Long.MIN_VALUE;
        Long rsum = Long.MIN_VALUE;
        long sum = 0;
        int minleft = 0;
        int maxright = 0;
        for(int i = mid; i>=start; i--){
            sum += a[i];
            if(sum > lsum){
                lsum = sum;
                minleft = i;
            }
        }
        sum = 0;
        for(int j = mid+1; j <= end; j++){
            sum += a[j];
            if(sum > rsum){
                rsum = sum;
                maxright = j;
            }
        }
        long[] c = new long[3];
        c[0] = lsum + rsum;
        c[1] = minleft;
        c[2] = maxright;
        return c;
    }



    public static long dynamic(int[] input){
        long[] res = new long[input.length];
        long max_sum = 0;
        for(int i = 0; i < input.length; i++){
            if(i == 0)
                res[i] = input[i];
            else
                res[i] = Math.max(res[i - 1] + input[i],input[i]);

            if(res[i] > max_sum)
                max_sum = res[i];
        }
        return max_sum;
    }
}
