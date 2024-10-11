import unittest
from ansible.modules.apt_repository import SourcesList


class TestSourcesList(unittest.TestCase):
    def test_init(self):
        module = None  # Replace with the actual module
        sources_list = SourcesList(module.config)
        self.assertEqual(sources_list.files, {})
        self.assertEqual(sources_list.new_repos, set())
        self.assertEqual(sources_list.default_file, '/etc/apt/sources.list')

    def test_expand_path(self):
        module = None  # Replace with the actual module
        sources_list = SourcesList(module)
        filename = 'test.list'
        expanded_path = sources_list._expand_path(filename)
        self.assertEqual(expanded_path, '/etc/apt/sources.list.d/test.list')

    def test_suggest_filename(self):
        module = None  # Replace with the actual module
        sources_list = SourcesList(module.Config(config_file))
        line = 'deb http://example.com/ubuntu hardy partner'
        filename = sources_list._suggest_filename(line)
        self.assertEqual(filename, 'example_com_ubuntu_hardy.list')

    def test_parse(self):
        module = None  # Replace with the actual module
        sources_list = SourcesList(module.config)
        line = 'deb http://example.com/ubuntu hardy partner'
        valid, enabled, source, comment = sources_list._parse(line)
        self.assertTrue(valid)
        self.assertTrue(enabled)
        self.assertEqual(source, 'deb http://example.com/ubuntu hardy partner')
        self.assertEqual(comment, '')

    def test_iter(self):
        module = None  # Replace with the actual module
        sources_list = SourcesList(module)
        sources_list.files = {
            '/etc/apt/sources.list': [
                (1, True, True, 'deb http://example.com/ubuntu hardy partner', 'Example comment')
            ]
        }
        for file, n, enabled, source, comment in sources_list:
            self.assertEqual(file, '/etc/apt/sources.list')
            self.assertEqual(n, 1)
            self.assertTrue(enabled)
            self.assertEqual(source, 'deb http://example.com/ubuntu hardy partner')
            self.assertEqual(comment, 'Example comment')

if __name__ == '__main__':
    unittest.main()