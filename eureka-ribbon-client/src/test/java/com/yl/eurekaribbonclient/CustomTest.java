package com.yl.eurekaribbonclient;

/**
 * @author Static
 * @date 2018/9/12 16:16
 */
public class CustomTest {
    private static final int SHIPMENT_NO_SEQ_CHAR_BASE = 65;

    /**
     * The limit of the shipment number suffix char.
     */
    private static final int SHIPMENT_NO_SEQ_CHAR_LIMIT = 90;

    public static void main(String[] args) {
        System.out.println(generateShipmentNo("MYS18091195S"));
    }

    private static String generateShipmentNo(String orderNo) {
        char nextMaxSuffix = (char) SHIPMENT_NO_SEQ_CHAR_BASE;
        String currMaxNo = "MYS18091195S";
//        nextMaxSuffix = (char) (currMaxNo.charAt(currMaxNo.length() - 1) + 1);
//        if (nextMaxSuffix < SHIPMENT_NO_SEQ_CHAR_BASE || nextMaxSuffix > SHIPMENT_NO_SEQ_CHAR_LIMIT) {
//            throw new ValidationException(String.format(
//                    "SP Shipment number suffix char: %s out of range under order %s", nextMaxSuffix, orderNo));
//        }
        return String.format("%s%s", orderNo, nextMaxSuffix);
    }
}