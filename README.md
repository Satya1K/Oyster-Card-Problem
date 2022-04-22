# Oyster-Card-Problem
You are required to model the following fare card system which is a limited version of London’s
Oyster card system. At the end of the test, you should be able to demonstrate a user loading a card
with £30, and taking the following trips, and then viewing the balance.

1. Tube Holborn to Earl’s Court
2. 328 bus from Earl’s Court to Chelsea
3. Tube from Earl’s court to Hammersmith

OPERATION

● When the user passes through the inward barrier at the station, their oyster card is charged
the maximum fare.

● When they pass out of the barrier at the exit station, the fare is calculated and the maximum
fare transaction removed and replaced with the real transaction (in this way, if the user
doesn’t swipe out, they are charged the maximum fare).

● All bus journeys are charged at the same price.

● The system should favour the customer where more than one fare is possible for a given
journey. E.g. Holburn to Earl’s Court is charged at £2.50.

ASSUME STATIONS ZONES ARE AS FOLLOWS:

<img width="203" alt="image" src="https://user-images.githubusercontent.com/42642478/164798476-73f2a90f-285a-4950-b4ac-28a408959092.png">

ASSUME FARES ARE AS FOLLOWS:

<img width="359" alt="image" src="https://user-images.githubusercontent.com/42642478/164798597-14a8611e-3593-4675-baff-00cbab8e7aff.png">

OTHER CONSIDERATIONS

● Any bus journey costs a flat rate of £1.80 regardless of the journey stations.

● The maximum possible fare is therefore £3.20
