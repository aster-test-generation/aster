import unittest
from httpie.cli.argparser import *



class TestHTTPieArgumentParser(unittest.TestCase):
    def test_init(self):
        parser = HTTPieArgumentParser()
        self.assertIsInstance(parser, HTTPieArgumentParser)

    def test_parse_args(self):
        env = Environment()
        args = parser.parse_args(env, args=None, namespace=None)
        self.assertIsInstance(args, argparse.Namespace)

    def test_process_request_type(self):
        request_type = self.args.request_type
        self.args.json = request_type is RequestType.JSON
        self.args.multipart = request_type is RequestType.MULTIPART
        self.args.form = request_type in {RequestType.FORM, RequestType.MULTIPART}

    def test_process_url(self):
        if not URL_SCHEME_RE.match(self.args.url):
            if os.path.basename(self.env.program_name) == 'https':
                scheme = 'https://'
            else:
                scheme = self.args.default_scheme + '://'
            shorthand = re.match('^:(?!:)(\\d*)(/?.*)$', self.args.url)
            if shorthand:
                port = shorthand.group(1)
                rest = shorthand.group(2)
                self.args.url = scheme + 'localhost'
                if port:
                    self.args.url += ':' + port
                self.args.url += rest
            else:
                self.args.url = scheme + self.args.url

    def test_print_message(self):
        message = 'test message'
        file = self.env.stdout
        parser._print_message(message, file)

    def test_setup_standard_streams(self):
        self.args.output_file_specified = bool(self.args.output_file)
        if self.args.download:
            if not self.args.output_file and (not self.env.stdout_isatty):
                self.args.output_file = self.env.stdout
            self.env.stdout = self.env.stderr
            self.env.stdout_isatty = self.env.stderr_isatty
        elif self.args.output_file:
            self.args.output_file.seek(0)
            try:
                self.args.output_file.truncate()
            except IOError as e:
                if e.errno == errno.EINVAL:
                    pass
                else:
                    raise
            self.env.stdout = self.args.output_file
            self.env.stdout_isatty = False
        if self.args.quiet:
            self.env.stderr = self.env.devnull
            if not (self.args.output_file_specified and (not self.args.download)):
                self.env.stdout = self.env.devnull

if __name__ == '__main__':
    unittest.main()