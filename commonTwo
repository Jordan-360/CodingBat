AP-1 : commonTwo

Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. 
Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, 
taking advantage of the fact that they are in alphabetical order.


commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3

  public int commonTwo(String[] a, String[] b) {
   List<String> list = Arrays.asList(a);
        List<String> list2 = Arrays.asList(b);
        Set<String> uniqueStrings = new HashSet<>(list);
        Set<String> uniqueStrings2 = new HashSet<>(list2);
        String[] uniqueArray = uniqueStrings.toArray(new String[0]);
        String[] uniqueArray2 = uniqueStrings2.toArray(new String[0]);
        int counter = 0;
        for(int i = 0; i < uniqueArray.length; i++) {
            for (int j = 0; j < uniqueArray2.length; j++) {
                if (uniqueArray[i].equals(uniqueArray2[j])) {
                    counter++;
                }
            }
        }
        return counter;
}
