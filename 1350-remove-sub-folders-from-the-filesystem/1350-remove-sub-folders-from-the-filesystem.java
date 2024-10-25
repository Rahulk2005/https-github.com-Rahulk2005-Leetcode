class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        for(String a: folder)System.out.println(a);
        List<String> str = new ArrayList<>();
        String base="";

        for(int i=0;i<folder.length;i++)
        {
            final String s = folder[i];
            if(!base.isEmpty() && s.startsWith(base) && s.charAt(base.length()) == '/')
                continue;
            str.add(s);
            base = s;
        }
        return str;
    }
}