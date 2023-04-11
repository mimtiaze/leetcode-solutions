class Solution {
    public String removeStars(String s) {
        LinkedList<Character> l = new LinkedList<>();
        for (char ch: s.toCharArray()) {
            if (ch == '*') {
                l.removeLast();
            } else {
                l.addLast(ch);
            }
        }
        
        StringBuilder strbuilder = new StringBuilder();
        for (char ch : l) {
            strbuilder.append(ch);
        }
        return strbuilder.toString();
    }
}

/*
Method: Brute Force (Java)
Time: 38ms
public String removeStars(String s) {
    LinkedList<Character> l = new LinkedList<>();
    for (char ch: s.toCharArray()) {
        if (ch == '*') {
            l.removeLast();
        } else {
            l.addLast(ch);
        }
    }

    StringBuilder strbuilder = new StringBuilder();
    for (char ch : l) {
        strbuilder.append(ch);
    }
    return strbuilder.toString();
}


Method: Brute Force
TIme: 79ms

string removeStars(string s) {
    string str = "";
    for (char ch: s)
        ch == '*'? str.pop_back(): str.push_back(ch);
    return str;
}
*/