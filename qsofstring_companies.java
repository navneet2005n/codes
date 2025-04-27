
                //   Longest Substring with At Most K Distinct Characters

import java.util.HashMap;
public class qsofstring_companies {
	public static int kDistinctChars(int k, String str) {
		if(str == null || k == 0 || str.length() == 0){
			return 0;
		}
		int lp = 0;
		int maxlen = 0;
		HashMap <Character,Integer> h1= new HashMap<>();
		for(int rp = 0; rp< str.length(); rp++){
			char ch = str.charAt(rp);
			h1.put(ch,h1.getOrDefault(ch,0)+1);
			while(h1.size() > k){
				h1.put(str.charAt(lp),h1.get(str.charAt(lp))-1);
				if(h1.get(str.charAt(lp)) == 0){
					h1.remove(str.charAt(lp));
				}
				lp++;
			}
			maxlen = Math.max(maxlen,rp-lp+1);
		}
		return maxlen;
  }
}

