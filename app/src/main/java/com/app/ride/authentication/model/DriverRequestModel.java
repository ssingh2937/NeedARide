package com.app.ride.authentication.model;

import com.google.firebase.firestore.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.List;

@IgnoreExtraProperties
public class DriverRequestModel implements Serializable {
    String LuggageAllow,PetsAllow,Uid,dateOfJourney,endPlace,startPlace,
            vehicleNumber,driverId,name,profileImage;
    int    seatAvailable;
    double costPerSeat;
    boolean rideCompleted,rideStarted;
    List<String> acceptedId;
    List<RatingModel> ratingList;
    List<String> acceptedUser;
    private String requestId;

    public List<String> getAcceptedUser() {
        return acceptedUser;
    }

    public void setAcceptedUser(List<String> acceptedUser) {
        this.acceptedUser = acceptedUser;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<RatingModel> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<RatingModel> ratingList) {
        this.ratingList = ratingList;
    }

    public boolean isRideCompleted() {
        return rideCompleted;
    }

    public void setRideCompleted(boolean rideCompleted) {
        this.rideCompleted = rideCompleted;
    }

    public boolean isRideStarted() {
        return rideStarted;
    }

    public void setRideStarted(boolean rideStarted) {
        this.rideStarted = rideStarted;
    }

    public List<String> getAcceptedId() {
        return acceptedId;
    }

    public void setAcceptedId(List<String> acceptedId) {
        this.acceptedId = acceptedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DriverRequestModel(String luggageAllow, String petsAllow, String uid, double costPerSeat, String dateOfJourney, String endPlace, int seatAvailable, String startPlace, String vehicleNumber, String driverId, String name, String profilePic) {
        LuggageAllow = luggageAllow;
        PetsAllow = petsAllow;
        Uid = uid;
        this.costPerSeat = costPerSeat;
        this.dateOfJourney = dateOfJourney;
        this.endPlace = endPlace;
        this.seatAvailable = seatAvailable;
        this.startPlace = startPlace;
        this.vehicleNumber = vehicleNumber;
        this.driverId = driverId;
        this.name = name;
        this.profileImage = profileImage;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    //Add this
    public DriverRequestModel() {

    }

    public String getLuggageAllow() {
        return LuggageAllow;
    }

    public void setLuggageAllow(String luggageAllow) {
        LuggageAllow = luggageAllow;
    }

    public String getPetsAllow() {
        return PetsAllow;
    }

    public void setPetsAllow(String petsAllow) {
        PetsAllow = petsAllow;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public double getCostPerSeat() {
        return costPerSeat;
    }

    public void setCostPerSeat(double costPerSeat) {
        this.costPerSeat = costPerSeat;
    }

    public String getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getProfilePic() {
        return profileImage;
    }

    public void setProfilePic(String profileImage) {
        this.profileImage = profileImage;
    }
}
