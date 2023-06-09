
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPersona extends Remote {

    int getId() throws RemoteException;
    void setId(int id) throws RemoteException;
    
    String getNombre() throws RemoteException;
    void setNombre(String nombre) throws RemoteException;
    
    String getEmail() throws RemoteException;
    void setEmail(String email) throws RemoteException;
    
    String getTelefono() throws RemoteException;
    void setTelefono(String telefono) throws RemoteException;
    
    String getString() throws RemoteException;  

    String getRfc() throws RemoteException;
    void setRfc(String rfc) throws RemoteException;
    
    String getApellidoPaterno() throws RemoteException;
    void setApellidoPaterno(String apellido) throws RemoteException;
    
    String getApellidoMaterno() throws RemoteException;
    void setApellidoMaterno(String apellido) throws RemoteException;
}