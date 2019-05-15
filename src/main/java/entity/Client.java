package entity;



import javax.persistence.*;
@Entity
@Table(name = "client")
public class Client {
//    private int id;
//    private String name;
//    private String adress;
//    private Pet PET;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//
//    @OneToOne
//    @JoinColumn(referencedColumnName = "id")
//    public Pet getPET(){
//        return this.PET;
//    }

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADRESS")
    private String adress;

    public Client(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
