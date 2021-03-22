package com.example.weather.model;

public class WeatherDto {
    private float temperature;
    private int pressure;
    private int humidity;
    private float windSpeed;

    WeatherDto(float temperature, int pressure, int humidity, float windSpeed) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
    }

    public float getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private float temperature;
        private int pressure;
        private int humidity;
        private float windSpeed;

        public Builder() {
        }

        public Builder temperature(float temperature) {
            this.temperature = temperature;
            return this;
        }

        public Builder pressure(int pressure) {
            this.pressure = pressure;
            return this;
        }

        public Builder humidity(int humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder windSpeed(float windSpeed) {
            this.windSpeed = windSpeed;
            return this;
        }

        public WeatherDto build() {
            return new WeatherDto(temperature, pressure, humidity, windSpeed);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "temperature=" + temperature +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", windSpeed=" + windSpeed +
                    '}';
        }
    }
}