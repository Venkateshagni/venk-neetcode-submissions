class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0];
            localName = localName.replace(".","");
            String[] localNameParts = localName.split("\\+");
            localName = localNameParts[0];
            uniqueEmails.add(localName + "@" + parts[1]);
        }
        return uniqueEmails.size(); 
    }
}