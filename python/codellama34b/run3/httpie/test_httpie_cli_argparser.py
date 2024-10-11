import unittest
from httpie.cli.argparser import *



class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        instance = HTTPieArgumentParser()
        self.assertEqual(instance.env, None)
        self.assertEqual(instance.args, None)
        self.assertEqual(instance.has_stdin_data, False)

    def test_process_output_options(self):
        instance = HTTPieArgumentParser()
        instance.args = argparse.Namespace(verbose=False, output_options=None, output_options_history=None, offline=False)
        instance._process_output_options()
        self.assertEqual(instance.args.output_options, 'hb')
        self.assertEqual(instance.args.output_options_history, 'hb')

        instance = HTTPieArgumentParser()
        instance.args = argparse.Namespace(verbose=True, output_options=None, output_options_history=None, offline=False)
        instance._process_output_options()
        self.assertEqual(instance.args.output_options, ''.join(OUTPUT_OPTIONS))
        self.assertEqual(instance.args.output_options_history, ''.join(OUTPUT_OPTIONS))

        instance = HTTPieArgumentParser()
        instance.args = argparse.Namespace(verbose=False, output_options=None, output_options_history=None, offline=True)
        instance._process_output_options()
        self.assertEqual(instance.args.output_options, OUTPUT_OPTIONS_DEFAULT_OFFLINE)
        self.assertEqual(instance.args.output_options_history, OUTPUT_OPTIONS_DEFAULT_OFFLINE)

        instance = HTTPieArgumentParser()
        instance.args = argparse.Namespace(verbose=False, output_options=None, output_options_history=None, offline=False)
        instance.env = Environment(stdout_isatty=False)
        instance._process_output_options()
        self.assertEqual(instance.args.output_options, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED)
        self.assertEqual(instance.args.output_options_history, OUTPUT_OPTIONS_DEFAULT_STDOUT_REDIRECTED)

        instance = HTTPieArgumentParser()
        instance.args = argparse.Namespace(verbose=False, output_options=None, output_options_history=None, offline=False)
        instance.env = Environment(stdout_isatty=True)
        instance._process_output_options()
        self.assertEqual(instance.args.output_options, OUTPUT_OPTIONS_DEFAULT)
        self.assertEqual(instance.args.output_options_history, OUTPUT_OPTIONS_DEFAULT)

if __name__ == '__main__':
    unittest.main()