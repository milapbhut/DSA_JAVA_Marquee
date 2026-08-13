class Solution {
	// Function to convert the given string to Camel Case
	public String convertToCamelCase(String s) {
		// code here
		StringBuilder sc = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				sc.append(s.charAt(i));
			}
			if (i != 0 && s.charAt(i) != ' ') {
				if (s.charAt(i - 1) == ' ') {
				    sc.append(Character.toUpperCase(s.charAt(i)));
				}
				else {
					sc.append(s.charAt(i));
					
				}
			}
		}
		return sc.toString();
	}
}
