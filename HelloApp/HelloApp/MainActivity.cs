using System;
using System.IO;
using System.Linq;
using Android.App;
using Android.Widget;
using Android.OS;

namespace HelloApp
{
    [Activity(Label = "HelloApp", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {        
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

            // Set our view from the "main" layout resource
            // SetContentView (Resource.Layout.Main);

            base.OnCreate(bundle);
            SetContentView(Resource.Layout.Main);
            Button button = FindViewById<Button>(Resource.Id.MyButton);
            //button.Click += delegate { button.Text = string.Format("{0} clicks!", count++); };
            var txt1 = FindViewById<EditText>(Resource.Id.TxtVal1);
            var txt2 = FindViewById<EditText>(Resource.Id.TxtVal2);
            var txtAdd = FindViewById<EditText>(Resource.Id.TxtAdd);
            var txtSub = FindViewById<EditText>(Resource.Id.TxtSub);

            button.Click += delegate {
                txtAdd.Text = Addition(txt1.Text, txt2.Text).ToString();
                txtSub.Text = Subtraction(txt1.Text, txt2.Text).ToString();
            };
        }

        private int Addition(string txt1, string txt2)
        {
            return Convert.ToInt32(txt1) + Convert.ToInt32(txt2);
        }

        private int Subtraction(string txt1, string txt2)
        {            
            return Convert.ToInt32(txt1) - Convert.ToInt32(txt2);
        }
    }
}

