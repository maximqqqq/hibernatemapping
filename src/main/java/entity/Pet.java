package entity;

import javax.persistence.*;

@Entity
@Table(name = "pet")

public class Pet {
//    private int id;
//    private String nic;
//      private Client CLIENT;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "CLIENT")
//    public Client getCLIENT() {
//        return CLIENT;
//    }



    @Column(name = "NIC")
    private String nic;

    public Pet(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nic='" + nic + '\'' +
                '}';
    }
}
