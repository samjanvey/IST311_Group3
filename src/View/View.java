
package View;

public class View {
    private InitialFrame initFrame;
    
    public View() {
        initFrame = new InitialFrame();
    }

    /**
     * @return the initFrame
     */
    public InitialFrame getInitFrame() {
        return initFrame;
    }

    /**
     * @param initFrame the initFrame to set
     */
    public void setInitFrame(InitialFrame initFrame) {
        this.initFrame = initFrame;
    }
    
}
