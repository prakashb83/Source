using System;
using Android.App;
using Android.Runtime;
using Android.Widget;
using Android.OS;
using Android.Content;
using Android.Views;
//using my_app;


//namespace my_app
//{
//    [Activity(Label = "my_app", MainLauncher = true, Icon = "@drawable/icon")]
//    public class MainActivity : Activity
//    {
//        protected override void OnCreate(Bundle bundle)
//        {
//            base.OnCreate(bundle);

//            // Set our view from the "main" layout resource
//            // SetContentView (Resource.Layout.Main);
//        }
//    }
//}
namespace my_app
{
    [Activity(Label = "HelloWorld", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {
        int count = 1, val;
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView(Resource.Layout.Main);
            Button button = FindViewById<Button>(Resource.Id.MyButton);
            button.Click += delegate { button.Text = string.Format("{0} clicks!", val = count++); GetValue(val); };

        }

        public int GetValue(int n)
        {
            var editText = FindViewById<EditText>(Resource.Id.editText);
            editText.Text = n.ToString();
            return n;
        }
    }
}