

import 'package:dart_future_v1/Geo.dart';

class Address {
  String? street;
  String? suit;
  String? city;
  String? zipcode;
  Geo? geo;

  Address(this.street, this.suit, this.city, this.zipcode, this.geo);

  Address.fromJson(Map<String, dynamic> json)
    : street = json["street"],
      suit = json["suit"],
      city = json["city"],
      zipcode = json["zipcode"],
      geo = json["geo"] != null ? Geo.fromJson(json["geo"]) : null;

  @override
  String toString() {
    return 'Address{street: $street, suit: $suit, city: $city, zipcode: $zipcode, geo: $geo}';
  }
}