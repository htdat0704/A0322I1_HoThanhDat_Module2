package case_study.repository;

import case_study.models.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements FacilityRepository {

    public static Map<Facility,Integer> facilityMap = new LinkedHashMap<>();
    public static Room room ;
    public static Room room2 ;
    public static House house ;

    static {
        room = new Room("nameService1", 6, 4, 6, "no");
        room2 = new Room("nameService2", 64, 4, 6, "no");
        house = new House("nameService3", 64, 4, 6, "34",3);
    }

    static {
        facilityMap.put(room,1);
        facilityMap.put(room2,5);
        facilityMap.put(house,1);
    }

    public Map<Facility, Integer> getFacilityMap() {
        return facilityMap;
    }

    public FacilityRepositoryImpl() {
    }

    @Override
    public void addNewFacility(Facility object) {
        if(facilityMap.get(object) == null){
            facilityMap.put(object,1);
        }else{
            int use = facilityMap.get(object);
            facilityMap.put(object,(use+1));
        }
    }

    @Override
    public Facility getFacility(int index) {
        int id = 0;
        for(Facility key: facilityMap.keySet()){
            if(id == index){
                return key;
            }
            id++;
        }
        return null;
    }

    @Override
    public void displayFacility() {
        int id = 0;
        for(Facility key: facilityMap.keySet()){
            System.out.println("ID Facility: "+(id++)+" infor Facility: "+key+" USED: "+facilityMap.get(key));
        }
    }

    @Override
    public void setFacility(int index, Facility facility) {
        if(getFacility(index) == null){
            throw new NullPointerException();
        }
        if(facility instanceof House){
            Facility houseEdit = getFacility(index);
            houseEdit = facility;
        }
        if(facility instanceof Villa){
            Facility villaEdit = getFacility(index);
            villaEdit = facility;
        }
        if(facility instanceof Room){
            Facility roomEdit = getFacility(index);
            roomEdit = facility;
        }

    }

    @Override
    public int sizeFacility() {
        return facilityMap.size();
    }

    @Override
    public void displayListFacilityMaintenance() {
        boolean checkUseOver5 = false;
        int id = 0;
        for(Facility key: facilityMap.keySet()){
            if(facilityMap.get(key) > 4){
                checkUseOver5 = true;
                break;
            }
        }
        if(checkUseOver5){
            for(Facility key: facilityMap.keySet()){
                if(facilityMap.get(key) > 4){
                    System.out.println("ID Facility: "+(id++)+" infor Facility: " +
                            ""+key+" USED: "+facilityMap.get(key));
                }
            }
        }else{
            System.out.println("No Facility Maintenance");
        }
    }

    public static void editUseFacility(Booking booking) {
        for(Facility facilityKey : facilityMap.keySet()){
            if(facilityKey.getNameService().equals(booking.getNameService())){
                facilityMap.put(facilityKey,(facilityMap.get(facilityKey)+1));
                System.out.println(facilityMap +" "+ facilityMap.get(facilityKey));
                break;
            }
        }
    }


}
