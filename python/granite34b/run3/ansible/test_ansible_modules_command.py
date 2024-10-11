import unittest
from ansible.modules.command import main


class TestCommandModule(unittest.TestCase):

    def test_main_with_args(self):
        args = ['ls', '-l']
        result = main()
        self.assertEqual(result['cmd'], args)
        self.assertEqual(result['rc'], 0)

    def test_main_with_argv(self):
        argv = ['echo', 'Hello, World!']
        result = main()
        self.assertEqual(result['cmd'], argv)
        self.assertEqual(result['rc'], 0)

    def test_main_with_args_and_argv(self):
        args = ['ls', '-l']
        argv = ['echo', 'Hello, World!']
        result = main()
        self.assertEqual(result['msg'], 'only command or argv can be given, not both')
        self.assertEqual(result['rc'], 256)

    def test_main_with_args_and_executable(self):
        args = ['ls', '-l']
        executable = '/bin/sh'
        result = main(args)
        self.assertEqual(result['msg'], "As of Ansible 2.4, the parameter 'executable' is no longer supported with the 'command' module. Not using '%s'." % executable)
        self.assertEqual(result['rc'], 0)

    def test_main_with_args_and_creates(self):
        args = ['ls', '-l']
        creates = '/tmp/testfile'
        result = main(args, creates=None)
        self.assertEqual(result['msg'], "Did not run command since '%s' exists" % creates)
        self.assertEqual(result['rc'], 0)

    def test_main_with_args_and_removes(self):
        args = ['ls', '-l']
        removes = '/tmp/testfile'
        result = main(args, removes=None)
        self.assertEqual(result['msg'], "Did not run command since '%s' does not exist" % removes)
        self.assertEqual(result['rc'], 0)

    def test_main_with_args_and_warn(self):
        args = ['ls', '-l']
        result = main(args)
        self.assertEqual(result['rc'], 0)

    def test_main_with_args_and_stdin(self):
        args = ['cat']
        stdin = 'Hello, World!'
        result = main(args)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], stdin)

    def test_main_with_args_and_stdin_add_newline(self):
        args = ['cat']
        stdin = 'Hello, World!'
        result = main(args, input=stdin, stdin_add_newline=False)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], stdin)

    def test_main_with_args_and_strip_empty_ends(self):
        args = ['echo', 'Hello, World!']
        result = main(args, strip_empty_ends=False)
        self.assertEqual(result['rc'], 0)
        self.assertEqual(result['stdout'], 'Hello, World!')

    def test_main_with_args_and_check_mode(self):
        args = ['ls', '-l']
        result = main(args, check_mode=False)
        self.assertEqual(result['msg'], 'Command would have run if not in check mode')
        self.assertEqual(result['rc'], 0)
        self.assertTrue(result['skipped'])

if __name__ == '__main__':
    unittest.main()