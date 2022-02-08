package TPGrupal.Oficial.TPGrupalLeo;

public abstract class Cliente extends Persona{

    static int tipoCliente;
    int idCliente;

    public Cliente(){
        super();
        this.tipoCliente = 0;
        this.idCliente = 0;
    }

    public  int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
