# SnackbarLeakDemoRepo
This demo shows that Snackbar leaks the Context in certain condition.

Reproduce Steps:
1. Use Android Studio to build and Install the App
2. Launch the App
3. Press "OPEN LEAKACTITIY" button, notice the LeakActivity is opened.
4. Press back key to close the LeakActivity
5. Repeat step 3 and 4 for 5 times.
6. Use Android Profiler to dump the Java heap (force GC before dumping the heap)
7. Count the instances of LeakActivity, the number should be 5.
