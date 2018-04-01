import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

import java.util.Scanner;

public class Main {

    public static void main(String []args){

        while (true){
            Scanner scanner = new Scanner(System.in);
            scanner.next();
            try {
                MqttClient client = new MqttClient("tcp://localhost:1883",MqttClient.generateClientId());
                client.connect();
                client.publish("aa","helo".getBytes(),0,false);
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }
    }
}
