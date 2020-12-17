import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proto.VectorTile;

import java.io.FileInputStream;
import java.io.FileWriter;

public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            LOG.error("Some exception occured", e);
            System.exit(1);
        }
        System.exit(0);
    }

    private static void run() throws Exception {

        try(FileInputStream fis = new FileInputStream("/home/khayrutdinov_fr/git/mapnik/13-2436-4999.mvt");
            FileWriter fw = new FileWriter("/home/khayrutdinov_fr/git/mapnik/13-2436-4999.txt")) {
            VectorTile.Tile tile174 = VectorTile.Tile.parseFrom(fis);
//
//                for(VectorTile.Tile.Layer l : tile174.getLayersList()){
//                    if(l.getName().equals("water_10")){
//                      //  System.out.println(l.getFeatures(1).getId());
//                    }
//                }
//
//                System.out.println(tile174.getLayers(0).getFeatures(1).getGeometryCount());


            fw.write(tile174.toString());


        }    }
}

