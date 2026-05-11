package bean;

public class SistemaOs {

    private int idSistemaOs;
    private double custoAdicional;
    private String linux;
    private String windows;

    public SistemaOs() {
    }

    public int getIdSistemaOs() {
        return idSistemaOs;
    }
    public void setIdSistemaOs(int idSistemaOs) {
        this.idSistemaOs = idSistemaOs;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }
    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    public String getLinux() {
        return linux;
    }
    public void setLinux(String linux) {
        this.linux = linux;
    }

    public String getWindows() {
        return windows;
    }
    public void setWindows(String windows) {
        this.windows = windows;
    }
}