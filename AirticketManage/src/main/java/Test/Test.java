package Test;

import Module.FlightInfor;
import Service.FlightService;

public class Test {


    public static void main(String[] args) {
//        User user=new User();
//        user.setId(00001);
//        user.setMail("cyp1015@qq.com");
//        user.setName("陈亚鹏");
//        user.setPhoneNum(664685);
//        user.setPassword("");
//        user.setAge(20);
//        user.setAdress("浙江舟山市");
//        user.setSex("男");
//        System.out.println("姓名："+user.getName());
        FlightInfor flightInfor=new FlightInfor();
        flightInfor.setArriveTime("14:00");
        flightInfor.setEndPlace("福建");
        flightInfor.setFlightId(789998);
        flightInfor.setGoDate("2018-3-4");
        flightInfor.setGoTime("10:00");
        flightInfor.setStartPlace("哈尔滨");
        flightInfor.setTicketNum(88);
        flightInfor.setTicketPrice(1200);
       // System.out.println(flightInfor);
        FlightService flightService=new FlightService();
       // flightService.deleteFlight("");
        //flightService.updateFlight(flightInfor);
      //  flightService.addFlight(flightInfor);
        flightService.deleteFlight(246758);
        flightService.updateFlight(flightInfor);

    }
}
