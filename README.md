# ActivityLifecycleOrder

1. Two activities ActivityA, ActivityB

    ActivityA created (App launch)
    
        ActivityA: onCreate
        ActivityA: onStart
        ActivityA: onResume

    ActivityA invokes ActivityB
    
        ActivityA: onPause
        ActivityB: onCreate
        ActivityB: onStart
        ActivityB: onResume
        ActivityA: onStop

    App goes to background on home button click
    
        ActivityB: onPause
        ActivityB: onStop

    App resumes to foreground
    
        ActivityB: onRestart
        ActivityB: onStart
        ActivityB: onResume

    Back button clicked from ActivityB
    
        ActivityB: onPause
        ActivityA: onRestart
        ActivityA: onStart
        ActivityA: onResume
        ActivityB: onStop
        ActivityB: onDestroy

    Back button clicked from ActivityA
    
        ActivityA: onPause
        ActivityA: onStop
        ActivityA: onDestroy

2. Two activities ActivityA, ActivityB contains fragment

    ActivityA created (App launch)
    
        ActivityA: onCreate
        ActivityA: onStart
        ActivityA: onResume

    ActivityA invokes ActivityBWithFrag
    
        ActivityA: onPause
        ActivityBWithFrag: onCreate
        ActivityBFragment: onAttach
        ActivityBFragment: onCreate
        ActivityBFragment: onCreateView
        ActivityBFragment: onActivityCreated
        ActivityBFragment: onStart
        ActivityBWithFrag: onStart
        ActivityBWithFrag: onResume
        ActivityBFragment: onResume
        ActivityA: onStop

    App goes to background on home button click
    
        ActivityBFragment: onPause
        ActivityBWithFrag: onPause
        ActivityBFragment: onStop
        ActivityBWithFrag: onStop

    App resumes to foreground
    
        ActivityBWithFrag: onRestart
        ActivityBFragment: onStart
        ActivityBWithFrag: onStart
        ActivityBWithFrag: onResume
        ActivityBFragment: onResume

    Back button clicked from ActivityBWithFrag
    
        ActivityBFragment: onPause
        ActivityBWithFrag: onPause
        ActivityA: onRestart
        ActivityA: onStart
        ActivityA: onResume
        ActivityBFragment: onStop
        ActivityBWithFrag: onStop
        ActivityBFragment: onDestroyView
        ActivityBFragment: onDestroy
        ActivityBFragment: onDetach
        ActivityBWithFrag: onDestroy

    Back button clicked from ActivityA
    
        ActivityA: onPause
        ActivityA: onStop
        ActivityA: onDestroy
        
