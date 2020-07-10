class Solution {
    public static int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet<>();
        for(String email : emails) seen.add(cleanEmail(email));
        return seen.size();
    }

    private static String cleanEmail(String dirtyEmail) {
        StringBuilder sb = new StringBuilder();
        boolean isLocal = true;
        int iter = -1;
        while(iter < dirtyEmail.length()) {
            iter++;
            char letter = dirtyEmail.charAt(iter);
            if (letter == '@') {
                break;
            } else if (!isLocal || letter == '.'){
                continue;
            } else if (letter == '+'){
                isLocal = false;
                continue;
            } else {
                sb.append(letter);
            }
        }
        sb.append(dirtyEmail.substring(iter));
        return sb.toString();
    }
}