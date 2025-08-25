
package oops;

public class Deep {

    private String pName;
    private int pId;

    public Deep(){

    }

    public Deep(String name, int pId) {
        super();
        this.pName = name;
        this.pId = pId;
    }

    public void setPName(String name) {
        this.pName = name;
    }

    public String getPname() {
        return pName;
    }

    public void setPid(int id) {
        this.pId = id;
    }

    public int getPid() {
        return pId;
    }

    @Override
    public String toString() {
        return "Deep[pName=" + pName + "pId=" + pId + "]";
    }
}
