package com.example.applicationbusticket;

public class BusTicket {
    // задание полей сущности (её характеристик)
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private int groupPensioner;
    private int groupAdult;
    private int groupKids;
    private String departureDate; // время отправления
    private String travelTime; // время пути
    private int ticketPricePensioner;
    private int ticketPriceAdult;
    private int ticketPriceKids;


    // создание конструктора исходных данных
    public BusTicket(String departurePoint, String arrivalPoint, int groupPensioner, int groupAdult,
                     int groupKids, String departureDate, String travelTime, int ticketPricePensioner,
                     int ticketPriceAdult, int ticketPriceKids) {
        this.departurePoint = departurePoint; // место отправления
        this.arrivalPoint = arrivalPoint; // место прибытия
        this.groupPensioner = groupPensioner;
        this.groupAdult = groupAdult;
        this.groupKids = groupKids;
        this.departureDate = departureDate; // время отправления
        this.travelTime = travelTime; // время пути
        this.ticketPricePensioner = ticketPricePensioner; // стоимость билета
        this.ticketPriceAdult = ticketPriceAdult;
        this.ticketPriceKids = ticketPriceKids;
    }

    // создание геттеров и сеттеров
    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public int getGroupPensioner() { return groupPensioner; }

    public void setGroupPensioner(int groupPensioner) { this.groupPensioner = groupPensioner; }

    public int getGroupAdult() { return groupAdult; }

    public void setGroupAdult(int groupAdult) { this.groupAdult = groupAdult; }

    public int getGroupKids() { return groupKids; }

    public void setGroupKids(int groupKids) { this.groupKids = groupKids; }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public int getTicketPricePensioner() { return ticketPricePensioner; }

    public void setTicketPricePensioner(int ticketPricePensioner)
    { this.ticketPricePensioner = ticketPricePensioner; }

    public int getTicketPriceAdult() { return ticketPriceAdult; }

    public void setTicketPriceAdult(int ticketPriceAdult) { this.ticketPriceAdult = ticketPriceAdult; }

    public int getTicketPriceKids() { return ticketPriceKids; }

    public void setTicketPriceKids(int ticketPriceKids) { this.ticketPriceKids = ticketPriceKids; }

    // переопределение метода toString()
    @Override
    public String toString() {
        return "Билеты на междугородний автобус в количестве " + (groupPensioner + groupAdult + groupKids) + ":\n" + 
                "место отправления " + departurePoint + ",\n" +
                "место прибытия " + arrivalPoint + ",\n" +
                "дата отправления " + departureDate + ",\n" +
                "время пути " + travelTime + ",\n" +
                "стоимость билетов " + ((groupPensioner * ticketPricePensioner) +
                (groupAdult * ticketPriceAdult) + (groupKids * ticketPriceKids)) + " кредитов";
    }
}
