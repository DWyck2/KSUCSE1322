class InvalidTimeException(Exception):
    pass


def time(time):
    if ":" not in time:
        raise InvalidTimeException("Enter a valid time.")
    sTime = time.split(":", 2)
    for s in sTime:
        if len(s) > 2:
            raise InvalidTimeException("Enter a valid time.")
        for x in range(len(s)):
            if not s[x].isnumeric():
                raise InvalidTimeException("Enter a valid time.")
    hour = int(sTime[0])
    minute = int(sTime[1])
    second = int(sTime[2])
    if hour < 0 or hour > 23:
        raise InvalidTimeException("Hours not valid")
    if minute < 0 or minute > 59:
        raise InvalidTimeException("Minutes not valid")
    if second < 0 or second > 59:
        raise InvalidTimeException("Seconds not valid")
    return (hour * 60 * 60) + (minute * 60) + second


try:
    time1 = input("Enter time 1 in 24hr format as follows (HH:MM:SS)\n")
    fTime = time(time1)
    time2 = input("Enter time 2 in 24hr format as follows (HH:MM:SS)\n")
    sTime = time(time2)
    diff = sTime - fTime
    print("Difference in seconds:", diff)
except InvalidTimeException as e:
    print(e)
