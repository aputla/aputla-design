class FullName {}
class Address {}
enum Gender {}
enum EmploymentStatus {}
enum HomeOwnerStatus {}

class Person {
   private final FullName name;
   private final Address address;
   private final Gender gender;
   private final EmploymentStatus employment;
   private final HomeOwnerStatus homeOwnerStatus;

   private Person(
           FullName newName, 
           Address newAddress,
           Gender newGender, 
           EmploymentStatus newEmployment,
           HomeOwnerStatus newHomeOwner) {
       this.name = newName;
       this.address = newAddress;
       this.gender = newGender;
       this.employment = newEmployment;
       this.homeOwnerStatus = newHomeOwner;
   }

   public FullName getName() {
       return this.name;
   }

   public Address getAddress() {
       return this.address;
   }

   public Gender getGender() {
       return this.gender;
   }

   public EmploymentStatus getEmployment() {
       return this.employment;
   }

   public HomeOwnerStatus getHomeOwnerStatus() {
      return this.homeOwnerStatus;
   }

   public static class Builder {
      private FullName nestedName;
      private Address nestedAddress;
      private Gender nestedGender;
      private EmploymentStatus nestedEmploymentStatus;
      private HomeOwnerStatus nestedHomeOwnerStatus;

      public Builder(FullName newFullName, Address newAddress) {
          this.nestedName = newFullName;
          this.nestedAddress = newAddress;
      }

      public Builder name(FullName newName) {
          this.nestedName = newName;
          return this;
      }

      public Builder address(Address newAddress) {
          this.nestedAddress = newAddress;
          return this;
      }

      public Builder gender(Gender newGender) {
          this.nestedGender = newGender;
          return this;
      }

      public Builder employment(EmploymentStatus newEmploymentStatus) {
          this.nestedEmploymentStatus = newEmploymentStatus;
          return this;
      }

      public Builder homeOwner(HomeOwnerStatus newHomeOwnerStatus) {
          this.nestedHomeOwnerStatus = newHomeOwnerStatus;
          return this;
      }

      public Person createPerson() {
          return new Person(
                  nestedName, 
                  nestedAddress, 
                  nestedGender,
                  nestedEmploymentStatus, 
                  nestedHomeOwnerStatus);
      }
   }
}

public class BuilderPattern2 {
}
