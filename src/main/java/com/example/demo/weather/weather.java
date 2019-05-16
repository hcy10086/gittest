package com.example.demo.weather;

import java.util.ArrayList;

public class weather {
    data data;
    String status;

    public data getData() {
        return data;
    }

    public void setData(data data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    String desc;

    @Override
    public String toString() {
        return "weather{" +
                "data=" + data +
                ", status='" + status + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
    public class data {
        private tq yesterday;
        private String city;
        private ArrayList<tq> forecast;
        private String ganmao;
        private String wendu;

        public tq getYesterday() {
            return yesterday;
        }

        public void setYesterday(tq yesterday) {
            this.yesterday = yesterday;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public ArrayList<tq> getForecast() {
            return forecast;
        }

        public void setForecast(ArrayList<tq> forecast) {
            this.forecast = forecast;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        @Override
        public String toString() {
            return "data{" +
                    "yesterday=" + yesterday +
                    ", city='" + city + '\'' +
                    ", forecast=" + forecast +
                    ", ganmao='" + ganmao + '\'' +
                    ", wendu='" + wendu + '\'' +
                    '}';
        }
        public class tq {
            private String date;
            private String high;
            private String fx;
            private String low;
            private String fl;
            private String fengli;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            @Override
            public String toString() {
                return "tq{" +
                        "date='" + date + '\'' +
                        ", high='" + high + '\'' +
                        ", fx='" + fx + '\'' +
                        ", low='" + low + '\'' +
                        ", fl='" + fl + '\'' +
                        ", fengli='" + fengli + '\'' +
                        ", type='" + type + '\'' +
                        '}';
            }
        }
    }

}
