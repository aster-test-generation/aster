import os
import unittest
import cookiecutter.replay


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, os.path.join(replay_dir, 'template_name.json'))

class TestDump(unittest.TestCase):
    def test_dump_success(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': 'value'}
        dump(replay_dir, template_name, context)
        self.assertTrue(os.path.exists(os.path.join(replay_dir, 'template_name.json')))

    def test_dump_ioerror(self):
        replay_dir = '/non/existent/path'
        template_name = 'template_name'
        context = {'cookiecutter': 'value'}
        with self.assertRaises(IOError):
            dump(replay_dir, template_name, context)

    def test_dump_typeerror_template_name(self):
        replay_dir = 'replay_dir'
        template_name = 123
        context = {'cookiecutter': 'value'}
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_typeerror_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = 'not a dict'
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_valueerror_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {}
        with self.assertRaises(ValueError):
            dump(replay_dir, template_name, context)

class TestLoad(unittest.TestCase):
    def test_load_success(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': 'value'}
        dump(replay_dir, template_name, context)
        result = load(replay_dir, template_name)
        self.assertEqual(result, context)

    def test_load_typeerror_template_name(self):
        replay_dir = 'replay_dir'
        template_name = 123
        with self.assertRaises(TypeError):
            load(replay_dir, template_name)

    def test_load_valueerror_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {}
        dump(replay_dir, template_name, context)
        with self.assertRaises(ValueError):
            load(replay_dir, template_name)

if __name__ == '__main__':
    unittest.main()