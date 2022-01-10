package site.karrot.server.entity;

import javax.persistence.*;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String phoneNumber;

    private String profileImgUrl;

    @Column(nullable = false)
    private String homeAddress;

    private String nearAddress1;

    private String nearAddress2;

}
