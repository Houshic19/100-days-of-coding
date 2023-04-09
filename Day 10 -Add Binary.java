class Solution {
    public String addBinary(String a, String b) {
        int alen=a.length(),blen=b.length();
        int i=0,c=0;
        String ans="";
        while(i<alen||i<blen||c!=0)
        {
            int x=0;
            if(i<alen&&a.charAt(alen-i-1)=='1')
                x=1;
            int y=0;
            if(i<blen&&b.charAt(blen-i-1)=='1')
                y=1;
            int sum=x+y+c;
            ans=sum%2+ans;
            c=sum/2;
            i++;
        }
        return ans;
    }
}