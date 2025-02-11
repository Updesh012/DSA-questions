package com.prospecta;

import com.prospecta.profile.AESEncryptionUtil;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread {

    public static void main(String[] args) throws InterruptedException {

        List<HashMap<String, String>> plantsData = new ArrayList<>();
        // Adding first plant data
        HashMap<String, String> plant1 = new HashMap<>();
        plant1.put("ONQD_PLANT", "PlantA");
        plant1.put("ONQD_STGE_LOC", "Loc1");
        plantsData.add(plant1);

        // Adding second plant data
        HashMap<String, String> plant2 = new HashMap<>();
        plant2.put("ONQD_PLANT", "PlantB");
        plant2.put("ONQD_STGE_LOC", "Loc2");
        plantsData.add(plant2);

        // Adding third plant data (with missing ONQD_STGE_LOC)
        HashMap<String, String> plant3 = new HashMap<>();
        plant3.put("ONQD_PLANT", "PlantC");
        plantsData.add(plant3);

        Set<String> onqdPlantAndStorageLocSet = plantsData.stream().flatMap(hm ->
                Stream.of(hm.getOrDefault("ONQD_PLANT", ""), hm.getOrDefault("ONQD_PLANT",
                        "") + hm.getOrDefault("ONQD_STGE_LOC", "")
                )).collect(Collectors.toSet());
        System.out.println("onqdPlantAndStorageLocSet value {} "+ onqdPlantAndStorageLocSet);

    }

    public static HashMap<String, List<HashMap<String, String>>>  createTempData () {
        HashMap<String, List<HashMap<String, String>>> result = new HashMap<>();
        List<HashMap<String, String>> listOfMap = new ArrayList<>();

        String materialDesc = "BEAM,High Beam,4,Beam material test\n";
        HashMap<String, String> headerMap = new HashMap<>();
        headerMap.put("MATL_DESC",materialDesc);
        headerMap.put("MAX_STOCK","1.000");
        headerMap.put("MATL_GROUP","6240");
        headerMap.put("IND_SECTOR", "I");
        headerMap.put("REORDER_PT","1.000");
        headerMap.put("MRP_TYPE","V1");
        headerMap.put("LOTSIZEKEY","0.000");
        headerMap.put("PLANT", "1001");
        headerMap.put("FMG_VALUE", "123");
        headerMap.put("STGE_BIN","1C08HO4000");
        headerMap.put("STGE_LOC", "Y010");

        HashMap<String, String> headerMap2 = new HashMap<>();
        headerMap2.put("MATL_DESC",materialDesc);
        headerMap2.put("MAX_STOCK","3.000");
        headerMap2.put("MATL_GROUP","6240");
        headerMap2.put("IND_SECTOR", "I");
        headerMap2.put("REORDER_PT","3.000");
        headerMap2.put("MRP_TYPE","V1");
        headerMap2.put("LOTSIZEKEY","3.000");
        headerMap2.put("PLANT","1003");
        headerMap2.put("FMG_VALUE","123");
        headerMap2.put("STGE_BIN","ZBC10A01");
        headerMap2.put("STGE_LOC","Y010");

        HashMap<String, String> headerMap3 = new HashMap<>();
        headerMap3.put("MATL_DESC",materialDesc);
        headerMap3.put("MAX_STOCK","6.000");
        headerMap3.put("MATL_GROUP","6240");
        headerMap3.put("IND_SECTOR", "I");
        headerMap3.put("REORDER_PT","6.000");
        headerMap3.put("MRP_TYPE","V1");
        headerMap3.put("LOTSIZEKEY","0.000");
        headerMap3.put("PLANT","1010");
        headerMap3.put("FMG_VALUE","123");
        headerMap3.put("STGE_BIN","R0P03B0200");
        headerMap3.put("STGE_LOC","Y010");

        listOfMap.add(headerMap);
        listOfMap.add(headerMap2);
        listOfMap.add(headerMap3);
        result.put("3244910", listOfMap);

        System.out.println(result);
        return result;
    }

}