package view;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;

public class Main_bean {
    private RichTable financeTable;
    private Object menuitem;
    //private Object menuItem;

    public Main_bean() {
        super();
    }

    /**
     * @param actionEvent
     */
    public void switchtable(ActionEvent actionEvent) {
        RichCommandMenuItem menuItem = (RichCommandMenuItem) actionEvent.getComponent();
        //boolean selected=menuitem.selected();
        boolean selected=menuItem.isSelected();
        this.getfinanceTable().setScrollPolicy(selected ? "scroll" : "page");
        
        // Add event code here...
    }
    
    public void setfinanceTable(RichTable financeTable) {
        this.financeTable = financeTable;
    }
    public RichTable getfinanceTable() {
        return financeTable;
    }
    
    public boolean isTableScrollMode() {
        return ("scroll".equals(this.getfinanceTable().getScrollPolicy()) ? true : false);
    }
}
