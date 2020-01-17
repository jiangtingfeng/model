package com.example.springboot.modelFactory.abstractModel;

import com.example.springboot.modelFactory.Shape;
import com.example.springboot.modelFactory.modelFactoryTwo.Blue;
import com.example.springboot.modelFactory.modelFactoryTwo.Color;
import com.example.springboot.modelFactory.modelFactoryTwo.Green;
import com.example.springboot.modelFactory.modelFactoryTwo.Red;
import org.springframework.util.StringUtils;

/**
 * @Author: jiangtingfeng
 * @Description:
 * @Date :Create in 10:10 2020/1/15
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(StringUtils.isEmpty(color)){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShapeOne(String shape) {
        return null;
    }
}
