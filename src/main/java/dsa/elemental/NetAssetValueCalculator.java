package dsa.elemental;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetAssetValueCalculator {

    class Holding {

        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("security")
        @Expose
        private String security;
        @SerializedName("quantity")
        @Expose
        private Integer quantity;
        @SerializedName("portfolio")
        @Expose
        private String portfolio;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSecurity() {
            return security;
        }

        public void setSecurity(String security) {
            this.security = security;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public String getPortfolio() {
            return portfolio;
        }

        public void setPortfolio(String portfolio) {
            this.portfolio = portfolio;
        }

        @Override
        public String toString() {
            return "Holding { " +
                    "date='" + date + '\'' +
                    ", security='" + security + '\'' +
                    ", quantity=" + quantity +
                    ", portfolio='" + portfolio + '\'' +
                    '}';
        }
    }

    public static void main(String args[]) throws IOException {

        String holdingServiceURL = "https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/holding";

        String pricingServiceURL = "https://raw.githubusercontent.com/arcjsonapi/HoldingValueCalculator/master/api/pricing";

        URL obj = new URL(holdingServiceURL);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            String inputLine;

            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {

                //System.out.println("inputLine : " + inputLine);

                response.append(inputLine);

            }

            in.close();

            Gson gson = new Gson();

            Holding[] holdings = gson.fromJson(response.toString(), Holding[].class);

            for(Holding holdingObject : holdings) {
                System.out.println(holdingObject);
            }

            System.out.println("Count of Elements : " + holdings.length);

        } else {
            System.out.println("GET request not worked");
        }

    }
}
