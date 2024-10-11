import unittest
from flutils.setuputils.cfg import each_sub_command_config


class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        config = list(each_sub_command_config())
        self.assertGreater(len(config), 0)
        for c in config:
            self.assertIsInstance(c.name, str)
            self.assertIsInstance(c.camel, str)
            self.assertIsInstance(c.description, str)
            self.assertIsInstance(c.commands, tuple)
            for cmd in c.commands:
                self.assertIsInstance(cmd, str)

if __name__ == '__main__':
    unittest.main()