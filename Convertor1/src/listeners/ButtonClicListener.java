package listeners;

import logic.*;
import utils.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ButtonClicListener implements ActionListener {

    private final JTextField textF1;
    private final JTextField textF2;
    private final JTextField textF3;
    private final JTextArea textArea;

    private final Convertor convertor;
    private final LengthLogic lengthLogic;
    private final TemperatureLogic temperatureLogic;
    private final TimeLogic timeLogic;
    private final VolumeLogic volumeLogic;
    private final WeightLogic weightLogic;

    public ButtonClicListener(JTextField textF1, JTextField textF2, JTextField textF3, JTextArea textArea, Convertor convertor){
        this.textF1 = textF1;
        this.textF2 = textF2;
        this.textF3 = textF3;
        this.textArea = textArea;

        this.lengthLogic = new LengthLogic();
        this.temperatureLogic = new TemperatureLogic();
        this.timeLogic = new TimeLogic();
        this.volumeLogic = new VolumeLogic();
        this.weightLogic = new WeightLogic();

        this.convertor = convertor;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(textF2.getText());
        double result = 0;

//LENGTH
//1
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.mToKm(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.mToMile(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.mToNauticalMile(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.mToCable(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.mToLeague(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.mToFoot(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_M) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.mToYard(num1);
        }
//2
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.kmToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.kmToM(num1);
            result = lengthLogic.mToMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.kmToM(num1);
            result = lengthLogic.mToNauticalMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.kmToM(num1);
            result = lengthLogic.mToCable(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.kmToM(num1);
            result = lengthLogic.mToLeague(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.kmToM(num1);
            result = lengthLogic.mToFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.kmToM(num1);
            result = lengthLogic.mToYard(result);
        }
//3
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.mileToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.mileToM(num1);
            result = lengthLogic.mToKm(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.mileToM(num1);
            result = lengthLogic.mToNauticalMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.mileToM(num1);
            result = lengthLogic.mToCable(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.mileToM(num1);
            result = lengthLogic.mToLeague(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.mileToM(num1);
            result = lengthLogic.mToFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.mileToM(num1);
            result = lengthLogic.mToYard(result);
        }
//4
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.nauticalMileToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.nauticalMileToM(num1);
            result = lengthLogic.mToKm(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.nauticalMileToM(num1);
            result = lengthLogic.mToMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.nauticalMileToM(num1);
            result = lengthLogic.mToCable(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.nauticalMileToM(num1);
            result = lengthLogic.mToLeague(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.nauticalMileToM(num1);
            result = lengthLogic.mToFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.nauticalMileToM(num1);
            result = lengthLogic.mToYard(result);
        }
//5
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.cableToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.cableToM(num1);
            result = lengthLogic.mToKm(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.cableToM(num1);
            result = lengthLogic.mToMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.cableToM(num1);
            result = lengthLogic.mToNauticalMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.cableToM(num1);
            result = lengthLogic.mToLeague(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.cableToM(num1);
            result = lengthLogic.mToFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.cableToM(num1);
            result = lengthLogic.mToYard(result);
        }
//6
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.leagueToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.leagueToM(num1);
            result = lengthLogic.mToKm(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.leagueToM(num1);
            result = lengthLogic.mToMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.leagueToM(num1);
            result = lengthLogic.mToNauticalMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.leagueToM(num1);
            result = lengthLogic.mToCable(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.leagueToM(num1);
            result = lengthLogic.mToFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.leagueToM(num1);
            result = lengthLogic.mToYard(result);
        }
//7
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.footToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.footToM(num1);
            result = lengthLogic.mToKm(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.footToM(num1);
            result = lengthLogic.mToMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.footToM(num1);
            result = lengthLogic.mToNauticalMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.footToM(num1);
            result = lengthLogic.mToCable(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.footToM(num1);
            result = lengthLogic.mToLeague(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD)){
            result = lengthLogic.footToM(num1);
            result = lengthLogic.mToYard(result);
        }
//8
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_M)){
            result = lengthLogic.yardToM(num1);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_KM)){
            result = lengthLogic.yardToM(num1);
            result = lengthLogic.mToKm(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_MILE)){
            result = lengthLogic.yardToM(num1);
            result = lengthLogic.mToMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_NAUTICAL_MILE)){
            result = lengthLogic.yardToM(num1);
            result = lengthLogic.mToNauticalMile(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_CABLE)){
            result = lengthLogic.yardToM(num1);
            result = lengthLogic.mToCable(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_LEAGUE)){
            result = lengthLogic.yardToM(num1);
            result = lengthLogic.mToLeague(result);
        }
        if (textF1.getText().equalsIgnoreCase(LengthConstants.LENGTH_YARD) && textF3.getText().equalsIgnoreCase(LengthConstants.LENGTH_FOOT)){
            result = lengthLogic.yardToM(num1);
            result = lengthLogic.mToFoot(result);
        }
//TEMPERATURE
//1
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.cToK(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.cToF(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.cToRe(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.cToRa(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.cToRo(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.cToN(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.cToD(num1);
        }
//2
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.kToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.kToC(num1);
            result = temperatureLogic.cToF(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.kToC(num1);
            result = temperatureLogic.cToRe(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.kToC(num1);
            result = temperatureLogic.cToRa(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.kToC(num1);
            result = temperatureLogic.cToRo(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.kToC(num1);
            result = temperatureLogic.cToN(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.kToC(num1);
            result = temperatureLogic.cToD(result);
        }
//3
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.fToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.fToC(num1);
            result = temperatureLogic.cToK(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.fToC(num1);
            result = temperatureLogic.cToRe(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.fToC(num1);
            result = temperatureLogic.cToRa(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.fToC(num1);
            result = temperatureLogic.cToRo(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.fToC(num1);
            result = temperatureLogic.cToN(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.fToC(num1);
            result = temperatureLogic.cToD(result);
        }
//4
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.reToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.reToC(num1);
            result = temperatureLogic.cToK(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.reToC(num1);
            result = temperatureLogic.cToF(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.reToC(num1);
            result = temperatureLogic.cToRa(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.reToC(num1);
            result = temperatureLogic.cToRo(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.reToC(num1);
            result = temperatureLogic.cToN(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.reToC(num1);
            result = temperatureLogic.cToD(result);
        }
//5
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.raToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.raToC(num1);
            result = temperatureLogic.cToK(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.raToC(num1);
            result = temperatureLogic.cToF(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.raToC(num1);
            result = temperatureLogic.cToRe(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.raToC(num1);
            result = temperatureLogic.cToRo(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.raToC(num1);
            result = temperatureLogic.cToN(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.raToC(num1);
            result = temperatureLogic.cToD(result);
        }
//6
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.roToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.roToC(num1);
            result = temperatureLogic.cToK(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.roToC(num1);
            result = temperatureLogic.cToF(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.roToC(num1);
            result = temperatureLogic.cToRe(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.roToC(num1);
            result = temperatureLogic.cToRa(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.roToC(num1);
            result = temperatureLogic.cToN(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.roToC(num1);
            result = temperatureLogic.cToD(result);
        }
//7
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.nToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.nToC(num1);
            result = temperatureLogic.cToK(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.nToC(num1);
            result = temperatureLogic.cToF(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.nToC(num1);
            result = temperatureLogic.cToRe(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.nToC(num1);
            result = temperatureLogic.cToRa(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.nToC(num1);
            result = temperatureLogic.cToRo(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D)){
            result = temperatureLogic.nToC(num1);
            result = temperatureLogic.cToD(result);
        }
//8
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_C)){
            result = temperatureLogic.dToC(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_K)){
            result = temperatureLogic.dToC(num1);
            result = temperatureLogic.cToK(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_F)){
            result = temperatureLogic.dToC(num1);
            result = temperatureLogic.cToF(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RE)){
            result = temperatureLogic.dToC(num1);
            result = temperatureLogic.cToRe(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RA)){
            result = temperatureLogic.dToC(num1);
            result = temperatureLogic.cToRa(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_RO)){
            result = temperatureLogic.dToC(num1);
            result = temperatureLogic.cToRo(result);
        }
        if (textF1.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_D) && textF3.getText().equalsIgnoreCase(TemperatureConstants.TEMPERATURE_N)){
            result = temperatureLogic.dToC(num1);
            result = temperatureLogic.cToN(result);
        }
//TIME
//1
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES)) {
            result = timeLogic.secondsToMinutes(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS)){
            result = timeLogic.secondsToHours(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS)){
            result = timeLogic.secondsToDays(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK)){
            result = timeLogic.secondsToWeek(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH)){
            result = timeLogic.secondsToMonth(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR)){
            result = timeLogic.secondsToYear(num1);
        }
//2
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS)) {
            result = timeLogic.minutesToSeconds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS)) {
            result = timeLogic.minutesToSeconds(num1);
            result = timeLogic.secondsToHours(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS)) {
            result = timeLogic.minutesToSeconds(num1);
            result = timeLogic.secondsToDays(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK)) {
            result = timeLogic.minutesToSeconds(num1);
            result = timeLogic.secondsToWeek(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH)) {
            result = timeLogic.minutesToSeconds(num1);
            result = timeLogic.secondsToMonth(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR)) {
            result = timeLogic.minutesToSeconds(num1);
            result = timeLogic.secondsToYear(result);
        }
//3
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS)) {
            result = timeLogic.hoursToSeconds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES)) {
            result = timeLogic.hoursToSeconds(num1);
            result = timeLogic.secondsToMinutes(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS)) {
            result = timeLogic.hoursToSeconds(num1);
            result = timeLogic.secondsToDays(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK)) {
            result = timeLogic.hoursToSeconds(num1);
            result = timeLogic.secondsToWeek(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH)) {
            result = timeLogic.hoursToSeconds(num1);
            result = timeLogic.secondsToMonth(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR)) {
            result = timeLogic.hoursToSeconds(num1);
            result = timeLogic.secondsToYear(result);
        }
//4
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS)) {
            result = timeLogic.daysToSeconds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES)) {
            result = timeLogic.daysToSeconds(num1);
            result = timeLogic.secondsToMinutes(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS)) {
            result = timeLogic.daysToSeconds(num1);
            result = timeLogic.secondsToHours(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK)) {
            result = timeLogic.daysToSeconds(num1);
            result = timeLogic.secondsToWeek(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH)) {
            result = timeLogic.daysToSeconds(num1);
            result = timeLogic.secondsToMonth(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR)) {
            result = timeLogic.daysToSeconds(num1);
            result = timeLogic.secondsToYear(result);
        }
//5
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS)) {
            result = timeLogic.weekToSeconds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES)) {
            result = timeLogic.weekToSeconds(num1);
            result = timeLogic.secondsToMinutes(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS)) {
            result = timeLogic.weekToSeconds(num1);
            result = timeLogic.secondsToHours(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS)) {
            result = timeLogic.weekToSeconds(num1);
            result = timeLogic.secondsToDays(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH)) {
            result = timeLogic.weekToSeconds(num1);
            result = timeLogic.secondsToMonth(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR)) {
            result = timeLogic.weekToSeconds(num1);
            result = timeLogic.secondsToYear(result);
        }
//6
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS)) {
            result = timeLogic.monthToSeconds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES)) {
            result = timeLogic.monthToSeconds(num1);
            result = timeLogic.secondsToMinutes(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS)) {
            result = timeLogic.monthToSeconds(num1);
            result = timeLogic.secondsToHours(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS)) {
            result = timeLogic.monthToSeconds(num1);
            result = timeLogic.secondsToDays(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK)) {
            result = timeLogic.monthToSeconds(num1);
            result = timeLogic.secondsToWeek(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR)) {
            result = timeLogic.monthToSeconds(num1);
            result = timeLogic.secondsToYear(result);
        }
//7
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_SECONDS)) {
            result = timeLogic.yearToSeconds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MINUTES)) {
            result = timeLogic.yearToSeconds(num1);
            result = timeLogic.secondsToMinutes(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_HOURS)) {
            result = timeLogic.yearToSeconds(num1);
            result = timeLogic.secondsToHours(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_DAYS)) {
            result = timeLogic.yearToSeconds(num1);
            result = timeLogic.secondsToDays(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_WEEK)) {
            result = timeLogic.yearToSeconds(num1);
            result = timeLogic.secondsToWeek(result);
        }
        if (textF1.getText().equalsIgnoreCase(TimeConstants.TIME_YEAR) && textF3.getText().equalsIgnoreCase(TimeConstants.TIME_MONTH)) {
            result = timeLogic.yearToSeconds(num1);
            result = timeLogic.secondsToMonth(result);
        }
//VOLUME
//1
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.lToM3(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.lToGallon(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.lToPint(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.lToQuart(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.lToBarrel(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.lToCubicFoot(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.lToCubicInch(num1);
        }
//2
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.m3ToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.m3ToL(num1);
            result = volumeLogic.lToGallon(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.m3ToL(num1);
            result = volumeLogic.lToPint(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.m3ToL(num1);
            result = volumeLogic.lToQuart(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.m3ToL(num1);
            result = volumeLogic.lToBarrel(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.m3ToL(num1);
            result = volumeLogic.lToCubicFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.m3ToL(num1);
            result = volumeLogic.lToCubicInch(result);
        }
//3
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.gallonToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.gallonToL(num1);
            result = volumeLogic.lToM3(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.gallonToL(num1);
            result = volumeLogic.lToPint(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.gallonToL(num1);
            result = volumeLogic.lToQuart(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.gallonToL(num1);
            result = volumeLogic.lToBarrel(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.gallonToL(num1);
            result = volumeLogic.lToCubicFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.gallonToL(num1);
            result = volumeLogic.lToCubicInch(result);
        }
//4
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.pintToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.pintToL(num1);
            result = volumeLogic.lToM3(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.pintToL(num1);
            result = volumeLogic.lToGallon(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.pintToL(num1);
            result = volumeLogic.lToQuart(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.pintToL(num1);
            result = volumeLogic.lToBarrel(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.pintToL(num1);
            result = volumeLogic.lToCubicFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.pintToL(num1);
            result = volumeLogic.lToCubicInch(result);
        }
//5
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.quartToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.quartToL(num1);
            result = volumeLogic.lToM3(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.quartToL(num1);
            result = volumeLogic.lToGallon(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.quartToL(num1);
            result = volumeLogic.lToPint(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.quartToL(num1);
            result = volumeLogic.lToBarrel(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.quartToL(num1);
            result = volumeLogic.lToCubicFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.quartToL(num1);
            result = volumeLogic.lToCubicInch(result);
        }
//6
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.barrelToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.barrelToL(num1);
            result = volumeLogic.lToM3(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.barrelToL(num1);
            result = volumeLogic.lToGallon(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.barrelToL(num1);
            result = volumeLogic.lToPint(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.barrelToL(num1);
            result = volumeLogic.lToQuart(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.barrelToL(num1);
            result = volumeLogic.lToCubicFoot(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.barrelToL(num1);
            result = volumeLogic.lToCubicInch(result);
        }
//7
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.cubicFootToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.cubicFootToL(num1);
            result = volumeLogic.lToM3(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.cubicFootToL(num1);
            result = volumeLogic.lToGallon(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.cubicFootToL(num1);
            result = volumeLogic.lToPint(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.cubicFootToL(num1);
            result = volumeLogic.lToQuart(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.cubicFootToL(num1);
            result = volumeLogic.lToBarrel(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH)){
            result = volumeLogic.cubicFootToL(num1);
            result = volumeLogic.lToCubicInch(result);
        }
//8
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_L)){
            result = volumeLogic.cubicInchToL(num1);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_M3)){
            result = volumeLogic.cubicInchToL(num1);
            result = volumeLogic.lToM3(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_GALLON)){
            result = volumeLogic.cubicInchToL(num1);
            result = volumeLogic.lToGallon(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_PINT)){
            result = volumeLogic.cubicInchToL(num1);
            result = volumeLogic.lToPint(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_QUART)){
            result = volumeLogic.cubicInchToL(num1);
            result = volumeLogic.lToQuart(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_BARREL)){
            result = volumeLogic.cubicInchToL(num1);
            result = volumeLogic.lToBarrel(result);
        }
        if (textF1.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_INCH) && textF3.getText().equalsIgnoreCase(VolumeConstants.VOLUME_CUBIC_FOOT)){
            result = volumeLogic.cubicInchToL(num1);
            result = volumeLogic.lToCubicFoot(result);
        }
//WEIGHT
//1
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G)){
            result = weightLogic.kgToG(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS)){
            result = weightLogic.kgToCarats(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS)){
            result = weightLogic.kgToEngPounds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS)){
            result = weightLogic.kgToPounds(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE)){
            result = weightLogic.kgToStone(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS)){
            result = weightLogic.kgToRusPounds(num1);
        }
//2
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG)){
            result = weightLogic.gToKg(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS)){
            result = weightLogic.gToKg(num1);
            result = weightLogic.kgToCarats(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS)){
            result = weightLogic.gToKg(num1);
            result = weightLogic.kgToEngPounds(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS)){
            result = weightLogic.gToKg(num1);
            result = weightLogic.kgToPounds(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE)){
            result = weightLogic.gToKg(num1);
            result = weightLogic.kgToStone(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS)){
            result = weightLogic.gToKg(num1);
            result = weightLogic.kgToRusPounds(result);}
//3
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG)){
            result = weightLogic.caratsToKg(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G)){
            result = weightLogic.caratsToKg(num1);
            result = weightLogic.kgToG(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS)){
            result = weightLogic.caratsToKg(num1);
            result = weightLogic.kgToEngPounds(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS)){
            result = weightLogic.caratsToKg(num1);
            result = weightLogic.kgToPounds(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE)){
            result = weightLogic.caratsToKg(num1);
            result = weightLogic.kgToStone(result);}
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS)){
            result = weightLogic.caratsToKg(num1);
            result = weightLogic.kgToRusPounds(result);}
//4
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG)){
            result = weightLogic.engPoundsToKg(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G)){
            result = weightLogic.engPoundsToKg(num1);
            result = weightLogic.kgToG(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS)){
            result = weightLogic.engPoundsToKg(num1);
            result = weightLogic.kgToCarats(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS)){
            result = weightLogic.engPoundsToKg(num1);
            result = weightLogic.kgToPounds(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE)){
            result = weightLogic.engPoundsToKg(num1);
            result = weightLogic.kgToStone(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS)){
            result = weightLogic.engPoundsToKg(num1);
            result = weightLogic.kgToRusPounds(result); }
//5
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG)){
            result = weightLogic.poundsToKg(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G)){
            result = weightLogic.poundsToKg(num1);
            result = weightLogic.kgToG(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS)){
            result = weightLogic.poundsToKg(num1);
            result = weightLogic.kgToCarats(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS)){
            result = weightLogic.poundsToKg(num1);
            result = weightLogic.kgToEngPounds(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE)){
            result = weightLogic.poundsToKg(num1);
            result = weightLogic.kgToStone(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS)){
            result = weightLogic.poundsToKg(num1);
            result = weightLogic.kgToRusPounds(result); }
//6
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG)){
            result = weightLogic.stoneToKg(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G)){
            result = weightLogic.stoneToKg(num1);
            result = weightLogic.kgToG(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS)){
            result = weightLogic.stoneToKg(num1);
            result = weightLogic.kgToCarats(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS)){
            result = weightLogic.stoneToKg(num1);
            result = weightLogic.kgToEngPounds(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS)){
            result = weightLogic.stoneToKg(num1);
            result = weightLogic.kgToPounds(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS)){
            result = weightLogic.stoneToKg(num1);
            result = weightLogic.kgToRusPounds(result); }
//7
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_KG)){
            result = weightLogic.rusPoundsToKg(num1);
        }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_G)){
            result = weightLogic.rusPoundsToKg(num1);
            result = weightLogic.kgToG(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_CARATS)){
            result = weightLogic.rusPoundsToKg(num1);
            result = weightLogic.kgToCarats(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_ENG_POUNDS)){
            result = weightLogic.rusPoundsToKg(num1);
            result = weightLogic.kgToEngPounds(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_POUNDS)){
            result = weightLogic.rusPoundsToKg(num1);
            result = weightLogic.kgToPounds(result); }
        if (textF1.getText().equalsIgnoreCase(WeightConstants.WEIGHT_RUS_POUNDS) && textF3.getText().equalsIgnoreCase(WeightConstants.WEIGHT_STONE)){
            result = weightLogic.rusPoundsToKg(num1);
            result = weightLogic.kgToStone(result); }

        textArea.setText(String.valueOf(result));

    }
}
