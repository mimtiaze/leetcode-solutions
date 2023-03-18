class BrowserHistory {
    DoubleList listHead;
    DoubleList cur;
    
    
    public BrowserHistory(String homepage) {
        listHead = new DoubleList(homepage);
        cur = listHead;
    }
    
    public void visit(String url) {
        DoubleList newPage = new DoubleList(url);
        cur.next = newPage;
        newPage.prev = cur;
        cur = newPage;
    }
    
    public String back(int steps) {
        while (steps > 0 && cur.prev != null) {
            cur = cur.prev;
            steps--;
        }
        
        return cur.address;
    }
    
    public String forward(int steps) {
        while (steps > 0 && cur.next != null) {
            cur = cur.next;
            steps--;
        }
        
        return cur.address;
    }
    
    class DoubleList {
        String address;
        DoubleList prev, next;
        
        DoubleList(String page) {
            address = page;
            prev = next = null;
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */