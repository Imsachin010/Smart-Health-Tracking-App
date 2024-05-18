# Smart-Health-Tracking-App
## Introduction
The convergence of IoT sensors and advanced health monitoring technologies, such as Photoplethysmography (PPG), has ushered in a new era of remote health assessment and fitness tracking. PPG-based IoT sensors provide real-time insights into various health metrics, including heart rate, blood oxygen levels, sleep patterns, and stress levels. 
This project presents a novel solution featuring:
1. An IoT-ML enabled platform for self-monitoring of important health vitals.
2. A fitness assessment score derived through a machine learning (ML) algorithm using the health vitals of a person.

By integrating data on various health parameters, including heart rate, blood oxygen levels, and sleep patterns, advanced machine learning models analyze this data to predict a fitness score that accurately reflects an individual’s overall health and fitness level.

## Features
- Unified monitoring of major health vitals.
- Fitness assessment score derived from health vitals.
- Integration of IoT hardware for real-time health monitoring.
- 
## App Interface
<img src="https://github.com/Imsachin010/Smart-Health-Tracking-App/assets/97721592/078b661f-6591-4f4b-b2be-bf319ac0780a" alt="App Interface" width="500" height="700"/>

## Architecture
The IoT hardware collects real-time health vitals, which are processed by the ML models. The ML models, developed in Python, analyze these vitals to compute a fitness score. This score and the vitals data are then displayed in the Android application, providing users with a comprehensive view of their health.

## How to Use
1. **Setup IoT Hardware**: Connect the sensors (MAX30100, DS18B20, MPU6050) to the Arduino UNO.
2. **Run ML Models**: Use the provided Python scripts to run the ML models and compute the fitness score.
3. **Deploy Android App**: Open the project in Android Studio, integrate with Firebase, and deploy the app to your device.

## Technologies Used
### Machine Learning
Developed using Python, the following ML models were utilized:
- Linear Regression
- DecisionTreeRegressor
- XGBoost Regressor

### IoT Hardware
- MAX30100 (Pulse Oximeter and Heart-Rate Sensor)
- DS18B20 (Temperature Sensor)
- MPU6050 (Gyroscope and Accelerometer)
- Arduino UNO

### Mobile Application
- Android Studio (Java)
- Firebase (Backend as a Service)
- ML Models integrated via pickling

## Getting Started
### Prerequisites
- Python 3.x
- Arduino IDE
- Android Studio
- Firebase Account

### Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/health-monitoring-app.git
   cd health-monitoring-app
