class Solution {
    public String interpret(String command) {
	StringBuilder S = new StringBuilder(command.length());
	for(int i=0;i<command.length();i++){
		if(command.charAt(i)=='G'){ 
            S.append('G');
        }else if(command.charAt(i)=='('){
			if(command.charAt(i+1)==')') {
                S.append('o'); 
                i++;
            }
			else{
                S.append("al"); 
                i=i+3;
            }
		}
	}
    
	return S.toString();
}
}