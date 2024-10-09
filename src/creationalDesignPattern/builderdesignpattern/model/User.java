package creationalDesignPattern.builderdesignpattern.model;


import lombok.Getter;


@Getter
public class User {
    private final String name;
    private final String phoneNo;
    private final String userId;
    private final String email;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.phoneNo = builder.phoneNo;
        this.userId = builder.userId;
        this.email = builder.email;
    }


    public static class UserBuilderName {
        private String name;

        public UserBuilderPhoneNo setName(String name) {
            this.name = name;
            return new UserBuilderPhoneNo(this);
        }
    }


    public static class UserBuilderPhoneNo {

        private final String name;
        private String phoneNo;

        UserBuilderPhoneNo(UserBuilderName userBuilderName) {
            this.name = userBuilderName.name;
        }

        public UserBuilderUserId setPhoneNumber(String phoneNo) {
            this.phoneNo = phoneNo;
            return new UserBuilderUserId(this);
        }
    }


    public static class UserBuilderUserId {

        private final String name;
        private final String phoneNo;
        private String userId;

        UserBuilderUserId(UserBuilderPhoneNo userBuilderPhoneNo) {
            this.name = userBuilderPhoneNo.name;
            this.phoneNo = userBuilderPhoneNo.phoneNo;
        }

        public UserBuilderEmailId setUserId(String userId) {
            this.userId = userId;
            return new UserBuilderEmailId(this);
        }
    }

    public static class UserBuilderEmailId {

        private final String name;
        private final String phoneNo;
        private final String userId;
        private String email;

        UserBuilderEmailId(UserBuilderUserId userBuilderUserId) {
            this.name = userBuilderUserId.name;
            this.phoneNo = userBuilderUserId.phoneNo;
            this.userId = userBuilderUserId.userId;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return new UserBuilder(this);
        }
    }

    public static class UserBuilder {
        private final String name;
        private final String phoneNo;
        private final String userId;
        private final String email;

        UserBuilder(UserBuilderEmailId userBuilderEmailId) {
            this.name = userBuilderEmailId.name;
            this.phoneNo = userBuilderEmailId.phoneNo;
            this.userId = userBuilderEmailId.userId;
            this.email = userBuilderEmailId.email;
        }

        public User build() {
            return new User(this);
        }
    }

    public static UserBuilderName builder() {
        return new UserBuilderName();
    }
}

