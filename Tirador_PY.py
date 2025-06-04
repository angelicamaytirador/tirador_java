Fullname = input("Enter your fullname: ")
Age = float(input("Enter your age: "))
Weight = float(input("Enter your weight: "))
Height = float(input("Enter your height: "))

Exercises_want_to_perform = input("Enter what exercise you want to perform: ")
Starting_time = input("Enter your starting time: ")
duration = input("Enter your duration: ")
End_time = input("Enter your ending time: ")

Happy = input("Do you feel improvements to your body? (yes/no): ")

# Suggest exercises based on weight
if Weight > 75:  # Assuming 75 kg as a threshold for weight management
    recommended_exercises = [
        "Running or jogging",
        "Cycling",
        "Swimming",
        "High-Intensity Interval Training (HIIT)",
        "Strength training with weights"
    ]
else:
    recommended_exercises = [
        "Walking",
        "Yoga",
        "Pilates",
        "Light strength training",
        "Aerobics"
    ]

print("\n---Setting Fitness---\n")
print(f"Fullname: {Fullname}")
print(f"Age: {Age}")
print(f"Weight: {Weight}")
print(f"Height: {Height}")
print(f"Exercise: {Exercises_want_to_perform}")
print(f"Starting time: {Starting_time}")
print(f"Duration: {duration}")
print(f"Ending time: {End_time}")
print(f"Improvements felt: {Happy}")

print("\n---Recommended Exercises for Weight Management---")
for exercise in recommended_exercises:
    print(f"- {exercise}")